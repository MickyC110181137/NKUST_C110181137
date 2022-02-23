const colors = ["green", "rgba(133,122,200)", "#f15025"];
const buttonPlace = document.getElementById("btn");
const text = document.querySelector(".color");
    
buttonPlace.addEventListener("click" , function() {
    const random = tryit();
    document.body.style.backgroundColor = colors[random];
    text.textContent = colors[random];
});
             
function tryit(){
    return Math.floor(Math.random() * colors.length);
}