public class QuickSort {

    private static void swap(Comparable[] array, int i, int j) {
        Comparable temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static int partition( Comparable[ ] array, int left, int right ) {
        int i = left, j = right;
        Comparable pivot = array[ (left + right) / 2 ];
        while( i <= j ) {
            for( ; array[i].compareTo(pivot) < 0; i ++ );
            for( ; array[j].compareTo(pivot) > 0; j -- );
            if( i <= j ) { swap( array, i ++, j -- ); }
        }
        return i;
    }

    public static void quickSort( Comparable[ ] array, int left, int right ) {
        int index = partition( array, left, right );

        if( left < index - 1 )
            quickSort( array, left, index-1 );
        if( index < right )
            quickSort( array, index, right );
    }
}
