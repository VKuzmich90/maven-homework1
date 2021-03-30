package by.kuzmich;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BinarySearchUtil {

    public static int recursiveBinarySearch(int array[], int firstIndex, int lastIndex, int elementToSearch) {

        Logger logger = LoggerFactory.getLogger(BinarySearchUtil.class);

        logger.debug("first index = " + firstIndex + "; last index = " + lastIndex + "; element to search = " + elementToSearch);

        if (lastIndex >= firstIndex) {
            int midIndex = firstIndex + (lastIndex - firstIndex) / 2;

            if (array[midIndex] == elementToSearch) {
                logger.debug("the middle element is the desired element");
                return midIndex;
            }

            if (array[midIndex] > elementToSearch) {
                logger.debug("If the middle element is larger than the target, we call recursion");
                return recursiveBinarySearch(array, firstIndex, midIndex - 1, elementToSearch);
            }

            logger.debug("We call recursion to narrow down the data");

            return recursiveBinarySearch(array, midIndex + 1, lastIndex, elementToSearch);
        }

        logger.debug("Return -1 if the required element is not found");

        return -1;
    }
}



