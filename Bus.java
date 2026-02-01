package Proj;

public class Bus {

    private  int busno;

    private boolean ac;

    private int capacity;

    Bus(int busno, boolean ac, int cap){
        this.busno = busno;
        this.ac = ac;
        this.capacity = cap;

    }

    public int getbusno(){
        return busno;
    }

    public boolean getac(){
        return ac;
    }

    public int getCapacity(){
        return capacity;
    }

    public void setAc(boolean a){

        ac = a;

    }

    public void setcapacity(int c){

        capacity = c;

    }

    public void display(){

        System.out.println("Busno:"+busno+" Ac:"+ac+" Capacity:"+capacity+"\n");

    }

}
