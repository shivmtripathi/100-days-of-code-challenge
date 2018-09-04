var myObj = {
  "name":"KIET geoup of institutions",
  "add":"Ghaziabad",
  "departments": {
    "department1":"MCA",
    "department2":"MBA",
   "department3":"B.tech",
   "Btech":{
       "branch1":"EC",
       "branch2":"CS",
       "branch3":"ME",
   }
   }
}
  
console.log(myObj.departments.Btech.branch1);

