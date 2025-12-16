import React, { useState } from 'react'

const AddProduct = () => {

    const [product,setProduct]=useState({
        productName:"",
        description:"",
        price:"",
        status:""
    });

    const handleChange=(e)=>{
        const value=e.target.value;
        setProduct({...product,[e.terget.name]:value});
    }

  return (
    <>
        <div className='container mt-3'>
            <div className='row'>
                <div className='col-md-6 offset-md-3'>
                    <div className='card'>
                        <div className="card-header fs-3 text-center">
                            Add Product
                        </div>
                        <div className='card-body'>
                            <form>
                                <div className='mb-3'>
                                    <label>Enter Product Name</label>
                                    <input type='text' name='productName' className='form-control'
                                    onChange={(e)=>handleChange(e)}/>
                                </div>
                                <div className='mb-3'>
                                    <label>Enter Description</label>
                                    <input type='text' name='description' className='form-control'
                                    onChange={(e)=>handleChange(e)}/>
                                </div>
                                <div className='mb-3'>
                                    <label>Enter Product Price</label>
                                    <input type='text' name='price' className='form-control'
                                    onChange={(e)=>handleChange(e)}/>
                                </div>
                                <div className='mb-3'>
                                    <label>Enter Product Status</label>
                                    <input type='text' name='status' className='form-control'
                                    onChange={(e)=>handleChange(e)}/>
                                </div>
                                <button className='btn btn-primary col-md-12'>Submit</button>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </>
  )
}

export default AddProduct