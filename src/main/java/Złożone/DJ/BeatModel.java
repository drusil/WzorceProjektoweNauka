package DJ;

import javax.sound.midi.*;
import java.util.ArrayList;

public class BeatModel implements BeatModelInterface, MetaEventListener {
    Sequencer sequencer;
    ArrayList obserwatorzyUderzeń = new ArrayList();
    ArrayList obserwatorzyBPM = new ArrayList();
    int bpm = 90;

    Sequence sequence;
    Track track;

    @Override
    public void inicjuj() {
        konfigurujMidi();
        zbudujŚcieżkęIRozpocznij();
    }

    @Override
    public void start() {
       sequencer.start();
       setBPM(90);
    }

    @Override
    public void stop() {
       setBPM(0);
       sequencer.stop();
    }

    @Override
    public void setBPM(int bpm) {
        this.bpm = bpm;
        sequencer.setTempoInBPM(getBPM());
        powiadomObserwatorówBPM();
    }



    @Override
    public int getBPM() {
        return bpm;
    }

    void uderzenieEvent(){
        powiadomObserwatorówUderzeń();
    }



    @Override
    public void zarejstujObserwatora(ObserwatorUderzeń o) {
        obserwatorzyUderzeń.add(o);
    }

    @Override
    public void wyrejstujObserwatora(ObserwatorUderzeń o) {
      int i = obserwatorzyUderzeń.indexOf(o);
      if(i >=0) obserwatorzyUderzeń.remove(o);
    }

    private void powiadomObserwatorówUderzeń() {
    for (int i = 0; i < obserwatorzyUderzeń.size(); i++){
        ObserwatorUderzeń obserwator = (ObserwatorUderzeń) obserwatorzyUderzeń.get(i);
        obserwator.aktualizujBeat();
    }
    }

    @Override
    public void zarejstujObserwatora(ObserwatorBPM o) {
      obserwatorzyBPM.add(o);
    }

    @Override
    public void wyrejstujObserwatora(ObserwatorBPM o) {
     int i = obserwatorzyBPM.indexOf(o);
     if(i >= 0) obserwatorzyBPM.remove(i);
    }

    private void powiadomObserwatorówBPM() {
        for(int i =0 ; i < obserwatorzyBPM.size(); i++){
            ObserwatorBPM obserwator= (ObserwatorBPM) obserwatorzyBPM.get(i);
            obserwator.aktualizujBMP();
        }
    }

    @Override
    public void meta(MetaMessage metaMessage) {
       if(metaMessage.getType() == 47){
           uderzenieEvent();
           sequencer.start();
           setBPM(getBPM());

       }
    }

    public void konfigurujMidi() {
        try{
            sequencer = MidiSystem.getSequencer();
            sequencer.open();
            sequencer.addMetaEventListener(this);
            sequence = new Sequence(Sequence.PPQ,4);
            track = sequence.createTrack();
            sequencer.setTempoInBPM(getBPM());
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public void zbudujŚcieżkęIRozpocznij() {
        int[] trackList = {35,0,46,0};

        sequence.deleteTrack(null);
        track = sequence.createTrack();

        zbudujŚcieżkę(trackList);
        track.add(zbudujMidiEvent(192,9,1,0,4));
        try {
            sequencer.setSequence(sequence);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    private MidiEvent zbudujMidiEvent(int polecenie, int kanał, int dane1, int dane2, int czas) {
        MidiEvent event = null;
        try{
            ShortMessage a = new ShortMessage();
            a.setMessage(polecenie,kanał,dane1,dane2);
            event = new MidiEvent(a,czas);
        } catch (Exception e){
            e.printStackTrace();
        }

        return event;

    }

    private void zbudujŚcieżkę(int[] trackList) {

        for (int i = 0; i < trackList.length; i++){
            int key = trackList[i];

            if (key != 0) {
                track.add(zbudujMidiEvent(144,9,key,100,i));
                track.add(zbudujMidiEvent(128,9,key,100,i+1));
            }
        }
    }


}
