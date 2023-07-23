import java.util.Arrays;
import java.util.Comparator;

public class DataContainer<T> {
    private T[] array;
    // Будем хранить индекс последнего элемента в массиве
    private int indexEndElement = -1;
    //Конструктор с заданием начальной емкости контейнера
    public DataContainer(int capacity) {
        // Просто создать массив объектов типа T в java нельзя, нашел такой выход из
        // ситуации
        array = (T[]) new Object[capacity];
    }
    //Конструктор по умолчанию
    public DataContainer() {
        this(10);
    }
    //Метод добавления объекта в контейнер
    public void add(T element) {
        indexEndElement++;
        // Если нам не хватает длинны массива для добавления нового элемента, то создаем
        // новый массив в два раза больший чем старый, копируем в него элементы из
        // старого
        // и сохраняем его ссылку в переменную array, а так как ссылки на старый массив
        // уже не будет, сборщик мусора его удалит из памяти.
        if (array.length <= indexEndElement) {
            T[] tempArray = (T[]) new Object[array.length * 2];
            System.arraycopy(array, 0, tempArray, 0, array.length);
            array = tempArray;
        }
        array[indexEndElement] = element;
    }
    //Метод получения объекта из контейнера
    public T get(int index) throws Exception {
        if (index > indexEndElement || index < 0)
            throw new Exception("Выход за диапазон элементов массива");
        else
            return array[index];
    }
    //Метод сортировки
    public void sort(Comparator<? super T> comparator){
        Arrays.sort(array, 0, indexEndElement + 1, comparator);
    }
    //Метод вывода на консоль
    public void print(){
        System.out.println(this.toString());
    }
    //Метод возвращает кол-во объектов в контейнере -1 если контейнер пустой
    public int count(){
        return indexEndElement;
    }

    @Override
    public String toString(){
        return Arrays.toString(Arrays.copyOfRange(array, 0, indexEndElement + 1));
    }
}
