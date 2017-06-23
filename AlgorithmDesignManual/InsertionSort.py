def insertionsort(array):
	for index in range(1, len(array)):
		currentvalue = array[index]
		position = index	
		while position > 0 and array[position - 1] > currentvalue:
			array[position] = array[position - 1]
			position = position - 1
		array[position] = currentvalue
		print(array)
array = [6, 3, 7, 2, 5, 4, 90, 0, 1, 6, 8, 13]
insertionsort(array)