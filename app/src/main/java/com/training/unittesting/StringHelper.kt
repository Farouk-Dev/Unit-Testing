package com.training.unittesting

class StringHelper {
    //      AACD -> CD / ACD -> CD  / CAD -> CD /CDAA -> CDAA
    fun truncateAInFirst2Positions(str: String): String? {
        if (str.length <= 2) return str.replace("A", "")
        val first2Chars = str.substring(0, 2)
        val stringMinusFirst2Chars = str.substring(2)
        return (first2Chars.replace("A", "")
                + stringMinusFirst2Chars)
    }

    fun areFirstAndLastTwoCharactersTheSame(str: String): Boolean {
        if (str.length <= 1) return false
        if (str.length == 2) return true
        val first2Chars = str.substring(0, 2)
        val last2Chars = str.substring(str.length - 2)
        return first2Chars == last2Chars
    }
}