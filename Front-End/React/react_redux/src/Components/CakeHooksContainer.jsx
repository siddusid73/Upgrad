//import React from 'react'
import {useSelector,useDispatch}from "react-redux";
import {buyCake} from "../redux/cake/CakeActions";

export default function CakeHooksContainer(){
     const numOfCakes = useSelector((state) => state.numOfCakes);
  const dispatch = useDispatch();
  return (
    <div>
      <h2>number of cakes : {numOfCakes}</h2>
      <button onClick={() => dispatch(buyCake())}>Buy cake</button>
    </div>
  );
}