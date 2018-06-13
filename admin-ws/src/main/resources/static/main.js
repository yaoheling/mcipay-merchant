 seajs.config({
    base:"./",
    charset:'utf-8',
    map:[],
    paths:{}
});

$(function(){
   seajs.use(["js/app.js"]);
});