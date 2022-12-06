/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//const date = new Date();

//date.setDate(date.getDate() + 30);

// ✅ 1 Day added
//console.log(date);

window.onload = function(){
const date = new Date('2022-11-23');

const dateCopy = new Date(date.getTime());

dateCopy.setDate(dateCopy.getDate() + 30);

// 👇️ Tue Feb 22 2022
console.log(dateCopy);

// 👇️ Mon Feb 21 2022 (didn't change original)
console.log(date);
document.getElementById('fechavencimiento').value=date+"-"+dateCopy;
}











