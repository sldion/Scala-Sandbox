object LPS extends App {

    def LongestPalindromeSubsequence(InitialString: String) : Int =
    {

        println(InitialString(0))

        if (InitialString.length() == 1) {return 1}
        else if(InitialString(0).toString == (InitialString.takeRight(1)))
        {
            return LongestPalindromeSubsequence(InitialString.substring(1, InitialString.length() - 1)) + 2
        }
        else
        {

            val PopBeg = LongestPalindromeSubsequence(InitialString.substring(1, InitialString.length()))
            val PopEnd = LongestPalindromeSubsequence(InitialString.substring(0, InitialString.length() - 1))

            if(PopBeg > PopEnd){return PopBeg }
            else {return PopEnd}
        }
    }
    val x = LongestPalindromeSubsequence("ABBDCACB")

    println(x)
}
