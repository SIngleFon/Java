package HomeWork_Ls2.Task2;
import java.io.IOException;
import java.util.logging.*;
import Source.sorce;

public class Task2 {
    public static void main(String[] args) throws Exception {
        Logger logger = Logger.getLogger(Task2.class.getName());
        FileHandler fh = new FileHandler("HomeWork_Ls2/Task2/logTask.xml");
        logger.addHandler(fh);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);
        logger.info("Sort Array");
        int[] sortArr = sorce.randomFillArrayInt();
        logger.log(Level.INFO, String.format(
                "Не отсортированный массив"));
        sorce.printIntArray(sortArr);
        for (int i = 0; i < sortArr.length - 1; i++) {
            for (int j = 0; j < sortArr.length - i - 1; j++) {
                if (sortArr[j + 1] < sortArr[j]) {
                    int swap = sortArr[j];
                    logger.setLevel(Level.INFO);
                    logger.log(Level.INFO, String.format("Сохранили элемент в темп"));
                    sortArr[j] = sortArr[j + 1];
                    sortArr[j + 1] = swap;
                    logger.setLevel(Level.INFO);
                    logger.log(Level.INFO, String.format(
                            "Убрали меньший влево, темп вправо"));
                }
            }
        }
        logger.log(Level.INFO, String.format(
                "Массив отсортирован!"));
        sorce.printIntArray(sortArr);
    }
}