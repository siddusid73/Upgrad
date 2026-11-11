import React, { useState } from 'react'

export default function UseStateEX() {
    // const [isOn, setsIsOn] = useState(false);
    // return (
    //     <div>
    //         <button onClick={() => setIsOn(!isOn)}>
    //             {isOn ? 'Turn Off' : 'Turn On'}
    //         </button>
    //     </div>
    // )

    const [count, setCount] = useState(0);
    return (
        <div>
            <h2>Count:{count}</h2>
            <button onClick={() => setCount(count + 1)}>
                Increment
            </button>
            <button onClick={() => setCount(count - 1)}>
                Decrement
            </button>
        </div>
    )
}
