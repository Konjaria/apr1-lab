class sortingAlgorithms{
    private static void swap(int a, int b)
    {
        int temp = a;
        a = b;
        b = temp;
    }
    public  void bubbleSort(int[] arr) {
        for (int j = 0; j < arr.length; j += 1) {
            for (int i = 0; i < arr.length - 1; i += 1) {
                if (arr[i] > arr[ i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        for(int a : arr)
            System.out.print(" " + a + " ");

    }

    public void selectionSort(int[] arr) {
        for (int sticker = 0; sticker < arr.length; sticker += 1) {
            int j = sticker;
            int minimum = arr[j];
            for (int i = sticker; i < arr.length; i += 1) {
                if (arr[i] < minimum) {
                    j = i;
                    minimum = arr[j];
                }
            }
            int temp = arr[sticker];
            arr[sticker] = minimum;
            arr[j] = temp;
        }
        for (int ar : arr)
        {
            System.out.print(ar + " ");
        }
    }

    public void insertionSort(int[] arr) {
        if(arr.length > 1)
        {
            for (int j = 1; j != arr.length; j += 1)
            {
                for (int i = 0; i < j; i++)
                {
                    if (arr[i] > arr[j])
                    {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
        for(int k : arr)
        {
            System.out.print(" " + k + " ");
        }
    }

}
