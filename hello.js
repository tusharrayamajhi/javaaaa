function vowel(str0){
    let count = 0;
    let str = str0.toLowerCase();
    for(let i =0;i<str.length;i++){
        if(str[i] == "a" || str[i] == "e"||str[i] == "i"||str[i] == "o"||str[i] == "u"){
            count++;
        }
    }
    return count;
}
function uniquechar(str){
    let ans ={};
    let unique = "";
    for(const char of str){
        if(!ans[char]){
            ans[char] = true;
            unique += char;
        }
    }
    console.log(unique);
}
function greater(num,key){
    const ans = [];
    for(const n of num){
        if(n >= key){
            ans.push(n);
        }
    }
    for(const n of ans){
        console.log(n);
    }
}
let num = [1,12,13,4,5,6,7,8,9,10,11,2,3,14,15];
greater(num,5);
function changeColor() {
    const myHeading = document.getElementById('myHeading');
    const randomColor = getRandomColor();
    myHeading.style.color = randomColor;
  }
  
  function getRandomColor() {
    // Generate random values for RGB (red, green, blue) components
    const r = Math.floor(Math.random() * 256);
    const g = Math.floor(Math.random() * 256);
    const b = Math.floor(Math.random() * 256);
  
    // Combine the RGB components into a CSS color string
    const color = `rgb(${r},${g},${b})`;
    return color;
  }
  



