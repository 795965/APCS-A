
/**
 * Eventually a bunch of balls interacting on the screen
 *
 * @Ziggy Sheynin
 * @Project Ball World - 914
 */
public class BallRunner
//creates class to put BallBot objects in
{
    // instance variables - replace the example below with your own
    private int x;
    /*
    // Create static method to 'run' activity 1
    public static void activity1 () {
    // creates window for the ballBots to run in 
    BallWorld ballWorld = new BallWorld (400,400);
    //initiates where the ballBots begin
    TGPoint startPoint = new TGPoint(0,0);
    //int startPoint = 0;
    int startHeading = 0;
    //gives the ball bot an initial radius
    int radius = 25;
    //creates a ballBot object with parameter of the window (object BallWorld), where it starts (int), what direction it faces(int) and the radius length(int))
    BallBot ballBot = new BallBot(ballWorld,startPoint,startHeading,radius);
    // create a while loop that lasts forever
    while (2 == 2){
    // all the time the ballBot can move forward it will forever
    if (ballBot.canMoveForward(ballWorld) == true){
    ballBot.moveForward();
    //if it can't move forward, it has to turn a random number of degrees within 360
    }else{
    startHeading = (startHeading + 90) % 360;
    ballBot.setHeading(startHeading);
    }
    }
    }
     */
    //creates a run method for activity 2
    /*public static void activity2 (){
    BallWorld ballWorld = new BallWorld (400,400);
    TGPoint startPoint = new TGPoint(0,0);
    //int startPoint = 0;
    int startHeading = (int)(Math.random()*360);
    int radius = (int)(Math.random()*20+1);
    BallBot ballBot = new BallBot(ballWorld,startPoint,startHeading,radius);

    BallBot[] ballBotArray = new BallBot[10];
    BallRunner ballRunner = new BallRunner ();

    while(1+1 == 2){
    int freeBallBotIndex = ballRunner.findFreeBallBotIndex(ballBotArray);
    if(freeBallBotIndex < ballBotArray.length){
    ballBotArray[freeBallBotIndex] = new BallBot(ballWorld, startPoint, startHeading, radius);
    }

    for(int index = 0; index < ballBotArray.length; index++){
    if(ballBotArray[index] != null){
    if(ballBotArray[index].canMoveForward(ballWorld) == true){
    ballBotArray[index].moveForward();}
    if (ballRunner.ballBotToBounceOff(ballBotArray[index], ballBotArray) == null){

    }
    else {
    startHeading = (int)(Math.random()*360);
    ballBotArray[index].setHeading(startHeading);
    }
    }

    }
    }
    }

    public int findFreeBallBotIndex(BallBot[] ballBotArray) {
    boolean empty = false;
    int x = 0;
    for (int i = 0; i < ballBotArray.length && empty == false; i++){
    if (ballBotArray [i] == null){
    empty = true;
    x = i;
    }
    }
    if (empty == true){
    return x;

    } else {
    return ballBotArray.length;
    }

    }

    public double distanceBetweenPoints (TGPoint point1, TGPoint point2){
    double xDiff = point1.x - point2.x;
    double yDiff = point2.x - point2.y;
    double xSquare = xDiff * xDiff;
    double ySquare = yDiff * yDiff;
    return Math.sqrt(xSquare + ySquare);
    }

    public boolean entranceClear (BallBot[] ballBotArray, TGPoint entrancePoint){
    boolean clear = true;
    for (int i = 0; i <ballBotArray.length; i++){
    if(ballBotArray [i] != null){
    double distance = distanceBetweenPoints(ballBotArray[i].getPoint(), entrancePoint);
    if (distance < ballBotArray [i].getRadius()*2){
    clear = false;
    }
    }
    }
    return clear;
    }

    public BallBot ballBotToBounceOff (BallBot ballBot, BallBot[] ballBotArray){
    TGPoint touch1 = ballBot.getPoint();
    TGPoint nextPoint = ballBot.forwardPoint();
    for (int i = 0; i < ballBotArray.length; i++){
    BallBot otherBallBot = ballBotArray[i];
    if (otherBallBot != null && otherBallBot != ballBot){
    double currentDistance = distanceBetweenPoints(touch1, otherBallBot.getPoint());
    if (currentDistance <= ballBot.getRadius() + otherBallBot.getRadius()){
    double nextDistance = distanceBetweenPoints(nextPoint, otherBallBot.getPoint());
    if(nextDistance <= currentDistance){
    return otherBallBot;
    }
    }
    }

    }
    return null;

    }
     */
    public static void activity4() {
        BallWorld ballWorld = new BallWorld(200, 200);
        TGPoint entrancePoint = new TGPoint(0, 0);
        int radius = 25;

        BallBot[] ballBotArray = new BallBot[10];
        BallRunner ballrunner = new BallRunner();

        while(1+1 == 2){
            if(ballrunner.entranceClear(ballBotArray, entrancePoint) == true){
                int freeBallBotIndex = ballrunner.findFreeBallBotIndex(ballBotArray);
                if(freeBallBotIndex < ballBotArray.length){
                    ballBotArray[freeBallBotIndex] = new BallBot(ballWorld, entrancePoint, Math.random()*360.0, radius);
                }
            }
            for(int index = 0; index < ballBotArray.length; index++){
                if(ballBotArray[index] != null){
                    if(ballBotArray[index].canMoveForward(ballWorld) == true){
                        if(ballrunner.ballBotToBounceOff(ballBotArray[index], ballBotArray) == null){
                            ballBotArray[index].moveForward();
                        } else {
                            ballBotArray[index].setHeading(Math.random()*360.0);
                        }
                    } else {
                        ballBotArray[index].setHeading(Math.random()*360.0);
                    }
                }
            }
        }
    }

    public BallBot ballBotToBounceOff(BallBot ballBot, BallBot[] ballBotArray){
        TGPoint point = ballBot.getPoint();
        TGPoint nextPoint = ballBot.forwardPoint();

        for(int i = 0; i < ballBotArray.length; i++){
            BallBot otherBallBot = ballBotArray[i];
            if(otherBallBot != null && otherBallBot != ballBot){
                double currentDistance = distanceBetweenPoints(touch1, otherBallBot.getPoint());
                if(currentDistance <= ballBot.getRadius() + otherBallBot.getRadius()){
                    double nextDistance = distanceBetweenPoints(nextPoint, otherBallBot.getPoint());
                    if(nextDistance <= currentDistance){
                        return otherBallBot;
                    }
                }
            }
        }

        return null;

    }
}

