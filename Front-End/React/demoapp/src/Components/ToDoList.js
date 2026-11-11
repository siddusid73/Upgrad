import React, { useEffect, useState } from 'react'

export default function ToDoList() {
    const [tasks, setTasks] = useState([]);
    useEffect(() => {

        fetch('https://newsapi.org/v2/top-headlines?country=us&category=business&apiKey=e3394179cb004f73b96d1821e1ccea19')
            .then(response => response.json())
            .then(data => setTasks(data));

    }, []); // Empty dependency array: runs only on mount​

    const handleAddTask = () => {
        const newTask = { id: tasks.length + 1, text: 'New Task' };
        setTasks([...tasks, newTask]);
    };
    return (
        <div>
            <h2>To-Do List</h2>
            <ul>
                {tasks.map(task => (
                    <li key={task.id}>{task.text}</li>
                ))}
            </ul>
            <button onClick={handleAddTask}>Add Task</button>
        </div>
    )
}