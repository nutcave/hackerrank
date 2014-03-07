package chocolatefeast

object Solution {

	def main( args : Array[String] ) {
		val T = readInt

		for ( i <- 0 until T ) {

			val ( n, c, m ) = readLine.split( " " ) match {
				case Array( n, c, m ) => ( n.toInt, c.toInt, m.toInt )
			}

			var chocolatesBought = ( n / c )
			var wrappersInHand = chocolatesBought

			while ( wrappersInHand / m > 0 ) {
				var chocolates = ( wrappersInHand / m )
				wrappersInHand = chocolates + ( wrappersInHand % m )
				chocolatesBought += chocolates
			}

			println( chocolatesBought )

		}

	}
}
