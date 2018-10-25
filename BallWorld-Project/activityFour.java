
/**
 * Write a description of class activityFour here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class activityFour
{
    // instance variables - replace the example below with your own
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
