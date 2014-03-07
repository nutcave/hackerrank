package sherlockbeast

object Solution {
	import scala.util.control.Breaks._

	def main( args : Array[String] ) {

		val T = readInt
		for ( i <- 0 until T ) {
			val N = readInt

			breakable {
				for ( nFives <- N to 0 by -1 ) {

					val nThrees = ( N - nFives )

					if ( ( nFives % 3 == 0 ) && ( ( N - nFives ) % 5 == 0 ) ) {
						println( "5" * nFives + "3" * nThrees )
						break
					}

					if ( nFives == 0 ) {
						println( "-1" )

					}

				}
			}

		}

	}
}
