## Maze generator

A simple library for generating mazes, the algorithms are few but will be added little by little!

------------



##### How to use:

- Add the jar file or maven dependency to your project.
- Declare a variable for the generator
` MazeGenerator generator;`
- Initialize the variable with an algorithm, for example:
`generator = new EllerAlgorithm(20,20);`
- Start the generation, (the method will return you an array of objects of type Cell once it's finished)
`Cell[][] map = generator.generateMaze();`

Done!! you have your maze ready to use!

##### Object of type Cell??




