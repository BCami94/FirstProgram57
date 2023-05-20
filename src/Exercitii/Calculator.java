package Exercitii;

import java.util.Objects;

public class Calculator {
    private String id;
    private String monitor;
    private String procesor;
    private String placaBaza;
    private String placaVideo;
    private int anFabricatie;

    public Calculator(String id){
        this.id = id;
    }
    public Calculator(String id, String monitor, String procesor, String placaVideo, String placaBaza, int anFabricatie)  {
        this(id);
        this.monitor = monitor;
        this.procesor= procesor;
        this.placaVideo = placaVideo;
        this.placaBaza = placaBaza;
        this.anFabricatie = anFabricatie;
    }

    public String getId(){
        return this.id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getMonitor(){
        return this.monitor;
    }

    public void setMonitor(String monitor){
        this.monitor = monitor;
    }

    public String getProcesor(){
        return this.procesor;
    }

    public void setProcesor(String procesor){
        this.procesor = procesor;
    }

    public String getPlacaVideo(){
        return this.placaVideo;
    }

    public void setPlacaVideo(String placaVideo){
        this.placaVideo = placaVideo;
    }

    public String getPlacaBaza(){
        return this.placaBaza;
    }

    public void setPlacaBaza(String placaBaza){
        this.placaBaza = placaBaza;
    }

    public int getAnFabricatie(){
        return this.anFabricatie;
    }

    public void setAnFabricatie(int anFabricatie){
        this.anFabricatie = anFabricatie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Calculator that = (Calculator) o;
        return anFabricatie == that.anFabricatie && Objects.equals(id, that.id) && Objects.equals(monitor, that.monitor) && Objects.equals(procesor, that.procesor) && Objects.equals(placaBaza, that.placaBaza) && Objects.equals(placaVideo, that.placaVideo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, monitor, procesor, placaBaza, placaVideo, anFabricatie);
    }

    @Override
    public java.lang.String toString() {
        return "Calculator{" +
                "id='" + id + '\'' +
                ", monitor='" + monitor + '\'' +
                ", procesor='" + procesor + '\'' +
                ", placaBaza='" + placaBaza + '\'' +
                ", placaVideo='" + placaVideo + '\'' +
                ", anFabricatie=" + anFabricatie +
                ", placaVideo='" + placaVideo + '\'' +
                ", anFabricatie=" + anFabricatie +
                '}';
    }
}
