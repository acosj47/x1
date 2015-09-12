//////// What am I trying to do???
//////// What is my name?  (CST 112; today's date?)

//// GLOBALS:  coordinates, speed, etc.
float x, y;       // Position of creature.
float dx, dy;     // Speed.
float horizon;

//// SETUP:  window size, initialization (start in middle of screen).
void setup() {
  size( 640,480);
  horizon=  height/4;
  x=  width/2;
  y=  height/2;
  dx=  3;
  dy=  2;
}

//// NEXT FRAME:  scene, action, show.
void draw() {
  //// SCENE:  sky, sun, tree, house, etc.
  stroke(0);
  strokeWeight(1);
  background( 100,150,200 );                // sky
  
  
  // Sunlight and values
  fill(255, 255, 255, 20);                      
  noStroke();
  ellipse(width*3/4, height/8, 140, 140);
  fill(255, 255, 255, 40);
  noStroke();
  ellipse(width*3/4, height/8, 120, 120);
  fill(255, 255, 255, 60);                    
  noStroke();
  ellipse(width*3/4, height/8, 90, 90);    
  
  // Sun
  fill( 255,255,0 );
  ellipse( width*3/4, height/8, 60,60 ); 
  
  // The Suns's Sunglasses
  stroke(0);
  fill(0);
  ellipse( width*3/4-12, height/8-2, 20, 10);
  ellipse( width*3/4+14, height/8-2, 20, 10);
  line(450, horizon-68, 460, horizon-62);
  line(510, horizon-68, 490, horizon-60);
  line(460, horizon-62, 500, horizon-62);
  
  // Suns' Smile
  fill(255,0,0);
  arc(width*3/4+1, height/8+8, 30, 30, HALF_PI/17, PI);
  
  // Grass
  fill( 100,200,100 );
  rect( 0,horizon, width,height*3/4 );      
  
  // Tree Trunk
  fill(#392707);                                         
  rect(horizon+25, horizon-30, 10, 30); 
  
  // Tree
  fill(100,200,100);
  triangle( horizon+10,horizon-25, horizon+35,horizon-100, horizon+50,horizon-25  );  // tree
  
                        
     // House
  fill(200,50,50);
  rect(200, horizon-60, 80, 60);   
  fill(0);
  triangle(185, horizon-60, 245, horizon-90, 300, horizon-60); 
  fill(0);
  rect(245, horizon-30, 15, 30);
                                            
                                            
                                           
       





  fill(0);
  text( "My name is Justin!", 10,height-20 );                                          
                                            
  //// ACTION:  move (x,y) coordinates.
  x=  x + dx;
  y=  y + dy;
  
  //// SHOW:  display the creature at (x,y)
  
  // Head of character
  fill(255,200,200);               // Head
  ellipse(x+15, y-15, 30, 30);
  
  fill(0);                         // Eyes
  ellipse(x+10, y-15, 5, 5);
  ellipse(x+23, y-15, 5, 5);

  // Body of character
  fill(255,0,0); 
  rect( x,y, 33,60 );
  fill(0);
  text( "Justin", x,y+15 );    // Name
  
  // Hat
  fill(0,0,255); 
  triangle(x, y-25, x+15, y-50, x+30, y-24);
  fill(#FFA703);
  ellipse(x+15, y-50, 10, 10);
  stroke(#FFA703);
  strokeWeight(2);
  line(x+4, y-32, x+27, y-28);
  line(x+6, y-37, x+26, y-33);
  line(x+8, y-42, x+22, y-39);
  
  
  // Arms
  stroke(0);
  line(x, y, x-20, y-9);
  line(x+33, y, x+54, y-17);

}


//////// HANDLERS:  mouse clicks, keys
void mousePressed() {
  x=  mouseX;                             // Set (x,y) to mouse
  y=  mouseY;
  //
  dx=  random( -6, +6 );                  // random speed.
  dy=  random( -4, +4 );
}

void keyPressed() {
  if (key == 'q') {
    exit();                           // press 'q' key to QUIT.
  }
}
   
   
