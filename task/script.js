const para = document.createElement("p");
const name = window.prompt("Enter your name: ").toUpperCase();
const node = document.createTextNode(name);
para.appendChild(node);

const element = document.getElementById("container");
element.appendChild(para);