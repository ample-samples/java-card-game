# **CardsTEC - Java Card Games**
Welcome to CardsTEC, a collection of multiple card games developed in Java, showcasing the principles of Object-Oriented Programming (OOP). This Maven project was created through collaborative programming efforts, with each team member contributing to specific game implementations and shared components.

## **Overview**
CardsTEC offers a variety of classic card games, including War, Blackjack, and Old Maid, each implemented with a focus on OOP principles such as encapsulation, inheritance, and polymorphism. The project structure promotes code modularity, extensibility, and maintainability, allowing for easy addition of new games in the future.

## **Collaborators and Ownership**
**War**: Developed by Emma Oyetey , the War class encapsulates the logic for playing the game of War, a simplified card game where players compete to win all the cards.

**Blackjack**: Todd undertook the implementation of Blackjack, a popular casino card game, focusing on creating Blackjack-specific functionalities.

**Old Maid**: Cheryl took the lead in implementing Old Maid, another classic card game, which adds diversity to the collection of available games.

## **Shared Components and Collaboration**
**User Interaction:** Collaboratively worked on, the User and UserInteraction classes provide a foundation for representing users and their interactions with the game. These classes demonstrate OOP principles and facilitate smooth gameplay interactions.

**Game:** The abstract Game class, along with its subclasses (War, Blackjack, Old Maid), lays the groundwork for consistent game implementations. It promotes code reuse, encapsulation, and polymorphism, enabling the creation of diverse card games with a unified structure.

**Card and Related Classes:** Developed collectively, the Card class, along with its related classes (SortBySuitThenValue, Suit Enum, BlackJackCard), provides a modular and reusable foundation for representing and manipulating playing cards in various card games.

## **Getting Started**
To start playing, simply run the Main class, which serves as the entry point for the program. Follow the prompts to choose a card game from the available options, and enjoy hours of entertainment with CardsTEC!

## **Detailed Description**
Following on from the above overview of the project and its collaborative development process, below is more detail on each repository and its components.

### **Main Class**
The Main class serves as the entry point for the program, it orchestrates the entire process of game selection and execution.
It displays a welcome message and prompts the user to choose a card game.
It creates an instance of GameLoader, which implements ChooseGame.
Inside a do-while loop, it repeatedly loads a game using the GameLoader and executes the game's logic.

### **/ Card**
**Card**
The Card Class represents a playing card, encapsulating card attributes such as value, symbol, and suit, which are set through the constructor and accessed via getter methods. 
Methods include getValue(), getSymbol(), and getSuit() which enable retrieval of card attributes,and setValue() and setSymbol() which allow modification of card properties. 
These facilitate data abstraction and manipulation while maintaining encapsulation.
Related Classes:	

**SortBySuitThenValue:** This class implements a comparator to sort cards first by suit and then by value. It demonstrates encapsulation by separating the sorting logic from the card class itself, adhering to the single responsibility principle.

**Suit Enum:** The Suit enum represents the four standard playing card suits (diamond, spade, club, heart) with their respective symbols. 
It demonstrates the use of enums to define a fixed set of constants, promoting code readability and maintainability.

**BlackJackCard:** Extends the Card class, introducing Blackjack-specific functionality. It utilizes a static initialization block to map card symbols to their corresponding Blackjack values, 
The Card class and its related classes provide a modular and reusable foundation for representing and manipulating playing cards in various card games.


### **/ Deck**
**Deck**
The Deck class manages a collection of playing cards, providing the foundation for managing decks of playing cards across the various card games, and offers operations for deck management. 
It abstracts the complexity of managing a deck, simplifying common operations like shuffling, sorting, and dealing
It's instance variables including cards, symbols, and suits are private or final, hiding implementation details.
It provides methods like createFullDeck() and createDemoDeck() for initializing the deck with standard or demo cards. 
Additional methods include shuffleDeck(), sortDeck(), and dealCard() which encapsulate deck manipulation, promoting abstraction and code organization.
Deck utilizes composition by including functionality from Card, SortBySuitThenValue, and Suit. 
Polymorphism is demonstrated through method overloading in sortDeck(), enabling different sorting strategies.
The class encapsulates behavior related to deck management, facilitating code reuse and maintainability.

**BlackJackDeck**
The BlackJackDeck class extends Deck and overrides the createFullDeck() method to initialize a deck specifically tailored for Blackjack, utilizing BlackJackCard instances. In effect, it reassigns the responsibility of assigning card values from the Deck class to the BlackJackCard class to conform to Blackjack rules, i.e. King = 10, Ace = 11 etc.

### **/ User** 
**User**
This class represents a generic user and serves as a blueprint for creating user objects in your game.
It serves as a base class for the UserInteraction class, allowing the latter to inherit its properties and potentially extend its functionality.
This class is currently not fully utilised but provides organisation, structure and potential extensibility to the codebase. 
It serves as a placeholder/foundation for future enhancements or refactorings;  additional features or behaviors for users.

**UserInteraction**
This class extends the User class and represents the interaction between a user and the game.
It has additional methods and functionality specific to interacting with a user's hand of cards.
Methods include; removeFromHand, drawACard, shuffleHand, removeCardByIndex, and getHand 
It has a constructor to initialize the hand ArrayList, ensuring that each instance of UserInteraction has an empty hand when created.
The class follows the principles of Object-Oriented Programming (OOP) by encapsulating related functionality into a single class (UserInteraction), 
inheriting from a base class (User), and providing methods to manipulate its internal state (hand).It abstracts away the complexity of managing user data and interactions, 
providing a simplified interface for interacting with users and their hands of cards.
Inheritance: By inheriting from the User class, UserInteraction inherits its properties and behaviors, promoting code reuse and extensibility.

### **/ Utilities**
**Utilities**
This class uses static methods for common tasks.
It provides utility methods for printing cards in ASCII art format and handling user input for displaying cards during gameplay. 
The printCard method formats a card's details into ASCII art and prints it to the console. 
The displayCards method prompts the user to press Enter to continue the game, ensuring smooth gameplay flow. 

**Commands**
The Commands class provides utility methods for displaying choices and handling user input.It includes methods for displaying a list of choices, getting user input for selecting a choice, and checking if the user wants to quit. This class promotes modularity and code readability by encapsulating common input/output functionality, enhancing the overall user experience across different parts of the application.

### */ Game*
**Game**
The Game class serves as an abstract template, providing as a blueprint for concrete game implementations.
It encapsulates common functionality, including the methods printTitle() and printRules(). 
It defines a standard interface for those that extend it; BlackJack, Old Maid and War; declaring abstract methods play() and playAgain(), while allowing for variation in gameplay and replayability.
The classes War, OldMaid, and Blackjack extend the Game class, inheriting its common functionality and enabling code reuse, as well as the ability to extend and specialize behavior in subclasses.
demonstarting Polymorphism with each subclass providing its own implementation of these methods. 
The play() method n this class defines the main game loop and controls the flow of gameplay. Subclasses override this method to implement the specific logic and rules of each game.
The playAgain() method prompts the user to decide whether to play the game again after a round or session has ended. Subclasses can customize this behavior as needed.
This class promotes code reuse, encapsulation, and polymorphism, making it easier to develop and maintain a variety of card games with consistent structure and behavior.

**GameLoader and the ChooseGame Interface:**
GameLoader is a class responsible for loading different card gamesbased on user input/choice. It returns an instance of the selected game (either War, Blackjack, or Old Maid). It implements the ChooseGame interface, ensuring consistency in how games are selected and loaded, requiring methods for printing available games and choosing a game. The printGames method displays the names of available games. The chooseGame method prompts the user to choose a game using the Commands class, which handles user input

**War**
The War class represents a simplified version of the card game "War" and extends the Game abstract class,inheriting common functionality such as printing the game title, rules, and determining whether to play again
The class encapsulates the logic for playing the game of War. It includes methods for setting up the game, dealing cards, handling player turns, resolving wars, checking for winners, and facilitating play again functionality.
Methods include; dealInitialHands(), war(), and reset() encapsulating specific aspects of the game's functionality, promoting modularity and maintainability.
It utilizes composition by creating instances of the Deck and UserInteraction classes (warDeck, bill, playerOne). This allows it to encapsulate related functionality and manage interactions between different components of the game.
The class interacts with users through console input and output, allowing them to play the game and decide whether to play again, highlighting the interaction between the game logic and user input/output.

**Old Maid**
The OldMaid class houses a simple version of the classic family card game Old Maid. The class extends the abstract Game class and implements the inherited functionality, in addition to having its own methods specific to the Old Maid game.

The game has been built following OOP principles and interacts with instances of the other shared classes across all 3 games such as the Deck, Card, and UserInteraction to create a user-friendly command line game. The game interacts with players through the console allowing players to enter inputs and receive game feedback output.