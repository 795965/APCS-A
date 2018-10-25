
/**
 * Eventually a bunch of balls interacting on the screen
 *
 * @Ziggy Sheynin
 * @Project Ball World - 914
 */
public class BallRunner
//creates class to put BallBot objects in
{
    public static void acitvity1 (){
        //Should create a black ball that starts in the middle then travels around the edge of the window
        BallWorld ballWorld = new BallWorld (200,200); //Declare and initialize window with length and width 200
        TGPoint startPoint = new TGPoint (0,0); //declares and initialize object of type TGPoint
        int startHeading = 0; //declares and initializes the initial direction the ball will move
        int radius = 25; //declares and initializes the radius of the ball
        BallBot ballBot = new BallBot (ballWorld, startPoint, startHeading,radius); //Creates a new ballbot with parameters
        while (2 == 2) { //endless loop that continuosly moves ballbot
            if(ballBot.canMoveForward(ballWorld) == true) { //if ballbot can move forward it does
                ballBot.moveForward(); //ballbot moves forward
            } else { //if it can't move forward it turns right
                startHeading = (startHeading +90) % 360; //turns
                ballBot.setHeading(startHeading); //new direction
            }
        }
    }

    public static void activity2(){
        //Should create ten balls that hit the wall and "bounce" off
        BallWorld ballWorld = new BallWorld (200,200); //Declare and initialize window with length and width 200
        TGPoint entrancePoint = new TGPoint (0,0); //makes each ball have a place to enter the screen
        int radius = 25; //declares and initializes radius length

        BallBot[] ballBotArray = new BallBot [10]; // declares and initializes an array of ballbot objects with length 10
        BallRunner ballrunner = new BallRunner(); //creates new ball

        while (2 == 2) { //creates another forever loop that moves ballbot
            int freeBallBotIndex = ballrunner.findFreeBallBotIndex(ballBotArray); //looks to find empty space in the array
            if (freeBallBotIndex < ballBotArray.length){ //if there are fewer than 10 ball execute next code
                ballBotArray[freeBallBotIndex] = new BallBot (ballWorld, entrancePoint, Math.random()*360.0,radius); //creates new ballbot object with different strating direction
            }
            for(int index = 0; index < ballBotArray.length; index++){//traverses ballbot Array
                if (ballBotArray[index] != null) { //if the array index is not empty
                    if(ballBotArray[index].canMoveForward(ballWorld) == true){ //if it can move forward
                        ballBotArray[index].moveForward(); //it moves forward
                    }
                } else {
                    ballBotArray[index].setHeading(Math.random()*360); // if it can't move forward it goes in a random direction
                }
            }

        }
    }

    public int findFreeBallBotIndex(BallBot[] ballBotArray){//creates a method for finding the empty space
        boolean empty = false; //decleares and initializes variable empty with type boolean
        int index = 0;
        for (int i = 0; i < ballBotArray.length && empty == false; i++){ //traverses array to see if any of the cells are empty
            if(ballBotArray[i] == null){ // if one of the cells is empty do next code
                empty = true;
                index = i;
            }
        }
        if(empty == true){ //if the cell is filled it will return the index of the array BallBotArray
            return index;
        }else { //if it is empty, return the last index value
            return ballBotArray.length;
        }
    }

    public static void activity3 (){
        //Should create 10 ball objects, each at once and they should bounce on the walls
        BallWorld ballWorld = new BallWorld (200,200); //Declare and initialize window with length and width 200
        TGPoint entrancePoint = new TGPoint (0,0); //makes each ball have a place to enter the screen
        int radius = 25; //declares and initializes radius length

        BallBot[] ballBotArray = new BallBot [10]; // declares and initializes an array of ballbot objects with length 10
        BallRunner ballrunner = new BallRunner(); //creates new ball

        while (2 ==2){ //creates endless while loop
            if (ballrunner.entranceClear(ballBotArray, entrancePoint) == true){ //is there an empty space in the array? (If yes, new ballbot needs to be created...
                int freeBallBotIndex = ballrunner.findFreeBallBotIndex(ballBotArray); //looks to find empty space in the array
                if (freeBallBotIndex < ballBotArray.length){ //if there are fewer than 10 ball execute next code
                    ballBotArray[freeBallBotIndex] = new BallBot (ballWorld, entrancePoint, Math.random()*360.0,radius); //creates new ballbot object with different strating direction
                }
            }
            for(int index = 0; index < ballBotArray.length; index++){//traverses ballbot Array
                if (ballBotArray[index] != null) { //if the array index is not empty
                    if(ballBotArray[index].canMoveForward(ballWorld) == true){ //if it can move forward
                        ballBotArray[index].moveForward(); //it moves forward
                    }
                } else {
                    ballBotArray[index].setHeading(Math.random()*360); // if it can't move forward it goes in a random direction
                }
            }
        }
    }

    public double distanceBetweenPoints(TGPoint point1, TGPoint point2){
        double xDiff = point1.x - point2.x; //Shows the change in x
        double yDiff = point1.y - point2.y; //Shows the change in y
        double squareX = Math.pow(xDiff, 2); //Shows the square root of the change in x
        double squareY = Math.pow(yDiff, 2); //Shows the square root of the change in y
        return Math.sqrt(squareX +squareY); // returns the difference between the two points
    }

    public boolean entranceClear (BallBot[] ballBotArray, TGPoint entrancePoint){// creares a method to find if there is a null value in the array
        boolean clear = true;
        for(int i = 0; i <ballBotArray.length; i++) {//traverses array ballBotArray
            if(ballBotArray[i] != null){ //if the index is empty
                double distance = distanceBetweenPoints(ballBotArray[i].getPoint(), entrancePoint); //uses the doubledistance method to chech the distance between ballbots and entrance points
                if(distance < ballBotArray[i].getRadius()*2){// if the distance is not greater than the radius of the bot *2 there is not enough room, so
                    clear = false; //dont add a bot
                }
            }

        }
        return clear; //return whether clear is true or false, whether or not to add another ballbot
    }

    public static void activity4(){
        //should create the same as activity 3, but now the balls also bounce off of eachother
        BallWorld ballWorld = new BallWorld (200,200); //Declare and initialize window with length and width 200
        TGPoint entrancePoint = new TGPoint (0,0); //makes each ball have a place to enter the screen
        int radius = 25; //declares and initializes radius length

        BallBot[] ballBotArray = new BallBot [10]; // declares and initializes an array of ballbot objects with length 10
        BallRunner ballrunner = new BallRunner(); //creates new ball

        while (2 ==2){ //creates endless while loop
            if (ballrunner.entranceClear(ballBotArray, entrancePoint) == true){ //is there an empty space in the array? (If yes, new ballbot needs to be created...
                int freeBallBotIndex = ballrunner.findFreeBallBotIndex(ballBotArray); //looks to find empty space in the array
                if (freeBallBotIndex < ballBotArray.length){ //if there are fewer than 10 ball execute next code
                    ballBotArray[freeBallBotIndex] = new BallBot (ballWorld, entrancePoint, Math.random()*360.0,radius); //creates new ballbot object with different strating direction
                }
            }
            for(int index = 0; index < ballBotArray.length; index++){//traverses ballbot Array
                if (ballBotArray[index] != null) { //if the array index is not empty
                    if(ballBotArray[index].canMoveForward(ballWorld) == true){ //if it can move forward
                        if(ballrunner.ballBotToBounceOff(ballBotArray[index], ballBotArray) == null){//if the ballbot is not touching another bot it should move forward
                            ballBotArray[index].moveForward(); //moves forward if not touching another ballbot
                        } else { //if it is touching another ballBot
                            ballBotArray[index].setHeading(Math.random()*360); //if it touching something it turns another direction
                        }
                    }
                }
            }
        }
    }

    public BallBot ballBotToBounceOff(BallBot ballBot, BallBot[] ballBotArray){ //creates a method for the ball to bounce off eachother
        //should makes it so when they hit eachother they also turn like its a wall
        TGPoint pointx = ballBot.getPoint(); // declares and initializes variable pointx, which will be where the balls touch
        TGPoint nextPoint = ballBot.forwardPoint();//if the ball moves forward and is still touching the other point...

        for(int i = 0; i <ballBotArray.length; i++) {//traverses the array ballBotArray
            BallBot otherBallBot = ballBotArray[i]; //declares and initializes otherBallBot object as the object in the array
            if(otherBallBot != null && otherBallBot != ballBot){// as long as the other bot isn't nothing or the original ballbot do the next code
                double currentDistance = distanceBetweenPoints(pointx, otherBallBot.getPoint()); //the distance between the two bots
                if(currentDistance <= ballBot.getRadius() + otherBallBot.getRadius()){//if the distance is less then the two radii added then
                    double nextDistance = distanceBetweenPoints(nextPoint, otherBallBot.getPoint()); //The distance between the two ball bots if they moved forward
                    if(nextDistance <= currentDistance){//if the distance if they moved forward is smaller then it should bounce
                        return otherBallBot; //But does it bounce - give me the other ballbot

                    }
                }
            }
        }
        return null;
    }
}
