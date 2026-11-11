import React, { useState } from 'react'

export default function UseStateEX() {
    const [newTask, setNewTask] = useState("");

    const handleInputChange = (event) => {
        setNewTask(event.target.value);
    };

    const handleSubmit = (event) => {
        event.preventDefault();
        // Add task logic
        setNewTask('');
    }

    //Event handling 2

    // function handleClick() {
    //     alert("Button clicked!");
    // }

    //Event handling 1

    // const [isOn, setsIsOn] = useState(false);
    // return (
    //     <div>
    //         <button onClick={() => setIsOn(!isOn)}>
    //             {isOn ? 'Turn Off' : 'Turn On'}
    //         </button>
    //     </div>
    // )
    // const [count, setCount] = useState(0);
    // return (
    //     <div>
    //         {/* <h2>Count:{count}</h2>
    //         <button onClick={() => setCount(count + 1)}>
    //             Increment
    //         </button>
    //         <button onClick={() => setCount(count - 1)}>
    //             Decrement
    //         </button> */}

    return (
        <div>
            <form onSubmit={handleSubmit}>
                <input type="text" value={newTask} onChange={handleInputChange} />
                <button type=" submit"> Add Task</button>
            </form>
        </div>
    )
}
