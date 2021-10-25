# sysc-3110-project

## Usage:
Run the main method in `Board.java`.

Sample game output:
```
Welcome to the game of Monopoly!
How many players?
2

===============================================
Player 0
Position: GO
Money: $1500
Enter a command (roll, q)
roll
Amount rolled is 6
You landed on Property: price=100, name='Vermont Avenue', colourGroup='grey', rent=10, rentWithColourSet=20
Would you like to buy this property? (yes or no)
yes
Congratulations! You now own Vermont Avenue

===============================================
Player 1
Position: GO
Money: $1500
Enter a command (roll, q)
roll
Amount rolled is 8
You landed on BlankBox: name='Visiting Jail'

===============================================
Player 0
Position: Vermont Avenue
Money: $1400
Current properties you own: 
Property: price=100, name='Vermont Avenue', colourGroup='grey', rent=10, rentWithColourSet=20
Enter a command (roll, q)
roll
Amount rolled is 9
You landed on Property: price=180, name='Tennessee Avenue', colourGroup='orange', rent=18, rentWithColourSet=36
Would you like to buy this property? (yes or no)
yes
Congratulations! You now own Tennessee Avenue

...
```

## Milestone 1 Changes:

Created initial design of a Monopoly style game.

Can play with 2-4 players. 

Players can either roll the dice or quit the game.

Players can purchase unowned properties, and will have to pay rent when 
they land on other player's properties. If a player owns all properties of a colour group, 
those properties will have an increased rent amount.

A player goes bankrupt when they are no longer have enough money to pay rent. 
The bankrupt player is removed from the game.

The game ends when there is only one player remaining in the game.
The remaining player is the winner.

## Known Issues:

When first starting the game, an integer must be entered for the number of players.

## Remaining Deliverables/Roadmap Ahead:

Milestone 2: GUI-based version and unit tests.

Milestone 3: Additional features (jail, "Go", railroad, utility) and "AI" players. 

Milestone 4: Save/load features and customizable games.

## Contributors:
* Thanuja Sivaananthan
* Shrimei Chock
* Sabah Samwatin
* Maisha Abdullah
