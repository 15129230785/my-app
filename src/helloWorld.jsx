import React from "react";

const HelloWorld = (props) => {
    console.log(props);
    return <div>
        {props.name} say: Hello worldll
    </div>
}

export default HelloWorld;