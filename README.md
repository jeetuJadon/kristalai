**Note** :
 
 Technology Used are spring boot ,java 8,
  data structure , REST ,maven , timer 
 In Sample Output ,
 
 generatedNumbers is 5 random numbers(first api)
 
 cumulativeData data is cumulation according to previous/current
 inputs taken from first method. 
 
 Duration has been taken seconds rather than minutes for better speedy
 testing. It can be changed to minutes.
 


**Api Endpoint** :  getRandomlyGeneratedNumbers


**API Sample Output** :


{ 
"generatedNumbers": 
[ 0.8417522251645468, 0.11524733267414033, 0.732247610077224, 0.37245051617194624, 0.8318972713829395 ], 
"cumulativeData": [ 
{ "cumulationValue": 2.893594955470797, "cumulationDuration": "5sec" }, 
{ "cumulationValue": 5.044055604427535, "cumulationDuration": "10sec" }, 
{ "cumulationValue": 6.5071091765348035, "cumulationDuration": "20sec" } ]
}