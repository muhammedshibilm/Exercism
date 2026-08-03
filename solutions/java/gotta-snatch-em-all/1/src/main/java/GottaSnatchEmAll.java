import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class GottaSnatchEmAll {

    

    static Set<String> newCollection(List<String> cards) {
          
        Set<String> blorkemonCards = new HashSet<>();
        
        cards.forEach((String arg0) ->blorkemonCards.add(arg0));

        return blorkemonCards;
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
         boolean myUniqueCards = myCollection.stream().anyMatch(arg0 -> !theirCollection.contains(arg0));
         boolean friendUnqueCard = theirCollection.stream().anyMatch(arg0 -> !myCollection.contains(arg0));

         return myUniqueCards && friendUnqueCard;
    }

    static Set<String> commonCards(List<Set<String>> collections) {
                
        Set<String> commonCards =new HashSet<>( collections.get(0));
            for (int i = 1; i < collections.size(); i++) {
                commonCards.retainAll(collections.get(i));
            }
            return commonCards;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> allCards = new HashSet<>();
        
         for (Set<String>  cards: collections) {
              allCards.addAll(cards);
         }

         return allCards;
    }
}
