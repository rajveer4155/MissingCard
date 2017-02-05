##  MissingCard
This program finds missing card(s) from a Deck of Cards. It is implemented in Hadoop Map-Reduce and is tested on Hadoop Cluster on AWS.

### 1. Representation of cards: 
 a.) A card is represented by both its rank and its suite.
 b.) The rank of Jack,Queen,King, Ace is taken as 10,11,12,13 respectively.
 c.) A card is represented by prepending first intial of its suite in caps to its rank. For e.g, a 9 of hearts is represented as H9, a jack of spade as S10 , an ace of Diamonds as D13 etc

### 2. Input files :
 a.) cards_input.txt – Deck of cards in which some cards are missing
 b.) deckOfCards.txt – Containing a full deck of 52 cards

### 3. Instructions to run:
1. Compile the code and export it as jar file.
2. Run it using command: 
  $ bin/hadoop jar jarfileName inputFiles outputLocation
