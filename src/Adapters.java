public class Adapters {

    private String manufacturer;                         // Производитель блока питания
    private String series;                             // Серия блока питания
    private String model;                         // Модель блока питания
    private double i;                // Сила тока -задает пользователь
    private double v;                 // Выходное напряжение - задает пользователь
    private double p;                   // Выходная мощность - задает пользователь
    public void setI(double ip){
        i=ip;
    }
    public void setV(double vp){
        v=vp;
    }
    public void setP(double pp){
        p=pp;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public void setSeries (String series){
        this.series=series;
    }

    public void setManufacturer(String manufacturer){
        this.manufacturer=manufacturer;
    }

    public int power(){                   // Мощность -просчитываем
         int w=(int)(v*i);
        return w;

    }


}
