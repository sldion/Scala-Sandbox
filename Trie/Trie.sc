
class Trie extends Traversable[String]{

    def Search(word: String) scala.collection.Seq[String]
    def append(key: String)
    def contains(word: String): Boolean
    def remove(word: String)

}


private[Trie] class TrieNode(

    val char: Option[char] = None,
    val word: Option[char] = None) extends Trie{
        private[Trie] val children: mutable.Map[char, TrieNode] =
            new java.util.TreeMap[Char, TrieNode]().asScala


    override def append(key: String) = {

        @tailrec def appendHelper(node: TrieNode, currentIndex: Int): Unit = {
        if (currentIndex == key.length) {
          node.word = Some(key)
          } else {
            val char = key.charAt(currentIndex).toLower
            val result = node.children.getOrElseUpdate(char, {
              new TrieNode(Some(char))
              })

              appendHelper(result, currentIndex + 1)
            }
          }

      appendHelper(this, 0)
    }

}
