import scala.Option.option2Iterable

object Solution {

	def main( args : Array[String] ) {

		val N = readInt
		val K = readInt

		val lines = for ( i <- 0 until N ) yield readInt
		val sortedNumbers = lines.sortWith( _ < _ )
		val sortedNumbersWithIndices = sortedNumbers.zip( 0 to N )

		val numbers = sortedNumbersWithIndices.flatMap {
			case ( v, i ) if i + K < N => Some( sortedNumbers( i + K - 1 ) - sortedNumbers( i ) )
			case ( _, _ ) => None
		}

		println( numbers.min )
	}
}
