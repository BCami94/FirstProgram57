package recapitulare;

import java.util.Objects;

public class Pagina {
    private String text;
    private boolean areImagine;

    public Pagina (String text, boolean areImagine){
        this.text = text;
        this.areImagine = areImagine;
    }

    public String getText(){
        return text;}

    public void setText(String text){
        this.text = text;
    }

    public boolean isAreImagine() {
        return areImagine;
    }

    public void setAreImagine(boolean areImagine) {
        this.areImagine = areImagine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pagina pagina = (Pagina) o;
        return areImagine == pagina.areImagine && Objects.equals(text, pagina.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, areImagine);
    }

    @Override
    public String toString() {
        return "Pagina{" +
                "text='" + text + '\'' +
                ", areImagine=" + areImagine +
                '}';
    }
}


