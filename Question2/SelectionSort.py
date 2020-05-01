class SelectionSort:
    def selection_sort(arr):
        for i in range(len(arr)):
            minimum = i

            for j in range(i + 1, len(arr)):

                if arr[j] < arr[minimum]:
                    minimum = j


            arr[minimum], arr[i] = arr[i], arr[minimum]

        return arr

    array = [6, 5, 8, 1, 2, 3, 4]

    selection_sort(array)

    for i in array:
        print(i)
