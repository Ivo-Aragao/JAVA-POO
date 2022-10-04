
package controle;

public class ControleRemoto implements InterfaceControlador{
    //ATRIBUTOS
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        //CONSTRUTOR
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }
   //METODOS ACESSORES GETTER AND SETTER 
    public int getVolume() {
        return volume;
    }

    public void setVolume(int v) {
        this.volume = v;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean l) {
        this.ligado = l;
    }

    public boolean getTocando() {
        return tocando;
    }

    public void setTocando(boolean t) {
        this.tocando = t;
    }
//METODOS ABSTRATOS
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirmenu() {
        System.out.println("esta ligado?" + this.getLigado());
        System.out.println("esta tocando?" + this.getTocando());
        System.out.println("volume: " + this.getVolume());
        for (int i = 0; i <= this.getVolume(); i+=10){
            System.out.println("[]");
        }
    }

    @Override
    public void fecharmenu() {
        System.out.println("fechando menu");
    }

    @Override
    public void maisvolume() {
         if(this.getLigado() == true){
             this.setVolume(this.getVolume() + 1);
         }else{
         System.out.println("impossivel aumentar volume, a tv esta desligada!");
         }
    }

    @Override
    public void menosvolume() {
        if(this.getLigado() == true){
          this.setVolume(this.getVolume() - 1);
        }else{
         System.out.println("impossivel diminuir volume, a tv esta desligada!");
        }
    }

    @Override
    public void ligarmudo() {
        if(this.getVolume() > 0 && this.getLigado()){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarmudo() {
        if(this.getVolume() == 0 && this.getLigado()){
                this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if(this.getLigado() && !(this.getTocando())){
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if(this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }
    }
}
