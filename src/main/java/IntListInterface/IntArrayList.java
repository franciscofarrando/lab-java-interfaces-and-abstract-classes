package IntListInterface;

public class IntArrayList implements IntList{
    private int[] data; //array
    private int size;

    public IntArrayList(){
        data = new int[10]; // array de 10 index
        size = 0;
    }



    @Override
    public void add(int number) {
        if (size == data.length){
            int newLength = data.length +data.length/2;
            int[] newData = new int[newLength];
            System.arraycopy(data, 0, newData, 0, data.length);
            data = newData;
        }
        data[size++] = number;

    }

    @Override
    public int get(int id) {
        return data[id];
    }
}
