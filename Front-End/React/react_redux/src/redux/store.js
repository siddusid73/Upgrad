import { createStore } from "redux";
import cakeReducer from "./cake/CakeReducer";

const store = createStore(cakeReducer);

export default store;


//npm install --save redux-devtools-extension