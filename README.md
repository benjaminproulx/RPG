# RPG

This is a simgple Java RPG program as a proof of concept of what can be done in java for a CLI-Based game.

This program was written by Benjamin Proulx (benjaminproulx) and Martin Calero (martonks) for Programming 1 at Vanier.

## Division of Tasks

- The main class was written by Benjamin Proulx with assistance from Martin Calero.
- The enemy class was written by Benjamin Proulx.
- The Dialogue class was mostly written by Martin Calero with some small changes from Benjamin Proulx.
- The combat clas was written by Benjamin Proulx.
- The NPC class was written by Martin Calero.
- The player class was written by Benjamin Proulx with assistance from Martin Calero. 

## Challenge

The challenge we decided on was to try to make the main class as barebones as possible so that if we were to make any changes to the game down the line, we wouldnt have to touch the main class. For example, if we wanted to make the combat harder, we would just have to change information that is found in the combat class such as the health pool and damage of the enemies. Even adding a whole new enemy type would be made easy with this system. Any changes to the dialogue can also be done this way.

This allows us to add or modify combat encounters and dialogue sessions. For example, if later on we wished to add a new combat encounter, we could copy paste the code form the doCombat method, change a couple of things around and call it something new. Then to bring that into the main class it would be as simple as the line of code

```Combat.doCombat2();```

## Remove repo link:
The remote repo can be found [here](https://github.com/benjaminproulx/RPG).
