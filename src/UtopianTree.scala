package utopiantree

object Solution {

	def main( args : Array[String] ) {

		val T = readInt

		for ( i <- 0 until T ) {
			val N = readInt

			var height = 1
			for ( c <- 0 until N ) {
				if ( c % 2 == 0 ) {
					height = height * 2
				}
				else {
					height += 1
				}
			}

			println( height )
		}

	}
}
