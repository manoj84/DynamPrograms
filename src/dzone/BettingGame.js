/**
 * You are involved in a betting game whose rules are as follows :
a) if you win a round, the bet amount will be added to your sum and next bet amount will be $1;
b) if you lose a round, the bet amount will be reduced from your total sum and next bet will be twice the previous.
c) game ends when all the rounds are complete or you dont have sufficient sum.
Initially, you are given with a string of the form “WLWWL” where W indicates a win and L indicates a loss and initial sum. Initial bet amount will be $1.
You need to find the amount at the end of the game.
Function prototypes and main was given for both questions
 */

var betting = function(data){
    var initial = 1;
    var bet = 1;
    for(var i=0; i<data.length; i++){
        if(data.charAt(i)== 'W'){
            initial = initial + bet;
            bet = 1;
        }
        
        else if(data.charAt(i) == 'L'){
            initial = initial - bet;
            if (initial < 0){
                console.log("insufficinet funds. Current bet is "+ bet +" Round is "+ i + " initial is "+ initial);
                return;
            }
            bet = bet*2 ;
        }
    }
    
    console.log (" betting finished. You won with " + initial );
}

betting("WLWWLLL");
