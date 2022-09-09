/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$('.topnav a').click(function(){
  $('#sideNavigation').style.width = "250px";
  $("#main").style.marginLeft = "250px";
});
 
$('.closebtn').click(function(){
  $('#sideNavigation').style.width = "0";
  $("#main").style.marginLeft = "0";
});
