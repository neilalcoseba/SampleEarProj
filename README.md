# A Simple Enterprise Java Bean(EJB)

## Error Message when deployment in Eclipse IDE on Glassfish
1. Go to **Servers** tab. Right-click on the **Glassfish** or *<depends on the name provided>*. Select the **Properties** on the Context-menu.
2. It will display a dialog box. Select the **Glassfish**.
3. Enable the **Use JAR archives for deployment.** by clicking the checkbox.
4. Click **Apply and close**.

## Command Line Deployment

- deployment

```
deploy --target=<TARGET_NAME> --name=<INSTANCE_NAME> <EAR_LOCATION>/SampleEAR.ear
```

- undeployment

```
undeploy --cascade=true --target=<TARGET_NAME> <INSTANCE_NAME>
```

- start instance

```
start-instance --sync full <INSTANCE_NAME>
```

- stop instance

```
stop-instance <INSTANCE_NAME>
```
- Error in deployment

```
Warning: Command _deploy did not complete successfully on server instance sample_1: remote failure: Failed to load the application on instance sample_1. The application will not run properly. Please fix your application and redeploy.
Exception while loading the app : Error in linking security policy for sample_1 -- Inconsistent Module State. Please see server.log for more details.
```

```
asadmin change-admin-password --domain_name domain1
asadmin enable-secure-admin --port 4848

asadmin add-library
```

- Disable CDI
```
asadmin set configs.config.server-config.cdi-service.enable-implicit-cdi=false
```
## Notes
1. This is created by Maven`s archetype-j2ee-simple archetype.
2. Deployed and tested in Glassfish 4.
3. Followed the book **EJB 3 in Action, Second Edition**.