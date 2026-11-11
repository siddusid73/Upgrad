// import React, { Component } from 'react'

// export default class Footer extends Component {
//     render() {
//         return (
//             <div>
//                 <div clasName="card">
//                     <ul className="list-group list-group-flush">
//                         <li className="list-group-item">Apple</li>
//                         <li className="list-group-item">Orange</li>
//                         <li className="list-group-item">Pineapple</li>
//                     </ul>
//                     <div className="card-footer">
//                         Fruits Names
//                     </div>
//                 </div>
//             </div>
//         )
//     }
// }



import React, { Component } from 'react'

export default class Footer extends Component {
    constructor(props) {
        super(props);
        this.state = {
            count: 0
        };
    }
    increment = () => {
        this.setState({
            count: this.state.count + 1
        });
    };
    decrement = () => {
        this.setState({
            count: this.state.count - 1
        });
    };
    render() {
        return (
            <div>
                <h2>Count:{this.state.count}</h2>
                <button onClick={this.increment}>Increment</button>
                <button onClick={this.decrement}>Decrement</button>
            </div>
        );
    }
}

