package fillingjars

object Solution {

	def main( args : Array[String] ) {
		val array = readLine.split( " " )

		val N = array( 0 ).toInt
		val M = array( 1 ).toInt

		var sum : Long = 0

		for ( i <- 0 until M ) {

			val ( a, b, c ) = readLine.split( " " ) match {
				case Array( a, b, c ) => ( a.toInt, b.toInt, c.toLong )
			}

			sum += ( b - a + 1 ) * c

		}

		println( sum / N )
	}

}
