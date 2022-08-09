
var sideBar = document.getElementById("mobile-nav");
var openSidebar = document.getElementById("openSideBar");
var closeSidebar = document.getElementById("closeSideBar");
// sideBar.style.transform = "translateX(-260px)";

function sidebarHandler(flag) {
    if (flag) {
        sideBar.style.transform = "translateX(0px)";
        openSidebar.classList.add("hidden");
        closeSidebar.classList.remove("hidden");
    } else {
        sideBar.style.transform = "translateX(-260px)";
        closeSidebar.classList.add("hidden");
        openSidebar.classList.remove("hidden");
    }
}

var noteCard = document.querySelector('.card-note')
async function getNote(){
     await fetch('https://jsonplaceholder.typicode.com/posts')
     .then((res) => {
        return res.json();
     })
     .then((res) => {
        console.log(res);
        for(const element of res){
            var node = noteCard.cloneNode(true);
            var text = element?.title.split(' ', 3);;
            node.children[0].children[0].children[0].innerHTML = text[0] + ' ' + text[1] + ' ' + text[2];
            node.children[0].children[1].innerHTML = element?.body;
            noteCard.parentNode.insertBefore(node, noteCard);
        }
     })
     .catch((res) => {
        console.log(res);
     })

}
getNote();

var marqueeNode = document.getElementsByClassName('marquee')
var marqueeBox = document.getElementById("marquee-notice");
console.log(marqueeBox.ch, marqueeNode);
async function getMarqueeNotice(){
     await fetch('https://jsonplaceholder.typicode.com/users/1/todos')
     .then((res) => {
        return res.json();
     })
     .then((res) => {
        console.log(res);
        function removeAllChildNodes(parent) {
            while (parent.firstChild) {
                parent.removeChild(parent.firstChild);
            }
        }
        removeAllChildNodes(marqueeNode[0]);
        removeAllChildNodes(marqueeNode[1]);
        for(const element of res){
            var node = marqueeBox.cloneNode(true);
            var text = element?.title.split(' ', 2);;
            node.children[0].children[0].children[0].children[0].innerHTML = text[0] + ' ' + text[1];
            node.children[0].children[0].children[1].innerHTML = element?.title;
            for (const ele of marqueeNode){
                ele.appendChild(node);
            }
        }

     })
     .catch((res) => {
        console.log(res);
     })

}
getMarqueeNotice();



var userMenuButton = document.getElementById("user-menu-button");
userMenuButton.onclick = function(){
    if(document.getElementById("user-menu-item-0").classList.contains('hidden')){
        document.getElementById("user-menu-item-0").classList.remove("hidden");
        document.getElementById("user-menu-item-0").classList.add("bg-white");

    } else {
        document.getElementById("user-menu-item-0").classList.add("hidden");
        document.getElementById("user-menu-item-0").classList.remove("bg-white");

    }
    if(document.getElementById("user-menu-item-1").classList.contains('hidden')){
        document.getElementById("user-menu-item-1").classList.remove("hidden");
        document.getElementById("user-menu-item-1").classList.add("bg-white");

    } else {
        document.getElementById("user-menu-item-1").classList.add("hidden");
        document.getElementById("user-menu-item-0").classList.remove("bg-white");

    }
    if(document.getElementById("user-menu-item-2").classList.contains('hidden')){
        document.getElementById("user-menu-item-2").classList.remove("hidden");
        document.getElementById("user-menu-item-2").classList.add("bg-white");

    } else {
        document.getElementById("user-menu-item-2").classList.add("hidden");
        document.getElementById("user-menu-item-0").classList.remove("bg-white");

    }
}
userMenuButton.click();

