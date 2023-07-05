package purchases;

public class CartManager {
    private PurchaseItem[] items = new PurchaseItem[0];

    public void add(PurchaseItem item) {
        // Создаём новый массив размером на еденицу больше
        int length = items.length +1;
        PurchaseItem[] tmp = new PurchaseItem[length];

        // копируем поэлементно
        for (int i = 0; i <items.length; i++) {
            tmp[i] = items [i];
        }

        // Кладем последний эелемент
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public PurchaseItem[] getAll() {
        PurchaseItem[] result = new PurchaseItem[items.length];
        //перебераем массив в прямом порядке, но кладём в результаты в обратном
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i -1;
            result[i] = items[index];
        }
        return result;
    }


    public void removeById(int id) {
        int length = items.length - 1;
        PurchaseItem[] tmp = new PurchaseItem[length];
        int index = 0;
        for (PurchaseItem item : items) {
            if (item.getId() != id) {
                tmp[index] = item;
                index++;
            }
        }
        //меняем элементы
        items = tmp;
    }
}
