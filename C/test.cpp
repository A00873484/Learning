#include <numeric>
#include <cmath>
#include <sstream>
#include <iostream>
#include <vector>
#include <cstdlib>

bool headsOrTails(){
    return rand()%10 > 4;
}

int main(){
    int heads = 0;
    int tails = 0;
    for(int i=0; i<100; i++){
        if(headsOrTails()){
            heads++;
        } else {
            tails++;
        }
    }
    std::cout<<"Out of 100 coin tosses";
    std::cout<<" heads: "<<heads;
    std::cout<<" tails: "<<tails;

    return 0;
}