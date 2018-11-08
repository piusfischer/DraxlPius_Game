using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class ball_movement : MonoBehaviour {


    public Rigidbody Ball;
	// Use this for initialization
	void Start () {

        Ball.useGravity = true;
        Ball.AddForce(0, 100, 200)
	}
	

	// Update is called once per frame
	void Update () {

       


		
	}
}
